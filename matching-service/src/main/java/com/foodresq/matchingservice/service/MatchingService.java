package com.foodresq.matchingservice.service; import com.foodresq.matchingservice.client.*; import com.foodresq.matchingservice.entity.FoodMatch; import com.foodresq.matchingservice.repository.FoodMatchRepository; import org.springframework.stereotype.Service; import java.time.*; import java.util.*;
@Service public class MatchingService{
private final DonationClient d; private final RecipientClient r; private final FoodMatchRepository repo;
public MatchingService(DonationClient d,RecipientClient r,FoodMatchRepository p){this.d=d;this.r=r;repo=p;}
public List<FoodMatch> find(String id){DonationResponse x=d.get(id);List<FoodMatch> out=new ArrayList<>();for(RecipientResponse y:r.all()){if(y.getStatus()!=null&&! "ACTIVE".equalsIgnoreCase(y.getStatus()))continue;double s=0;List<String>w=new ArrayList<>();
if(x.getFoodCategory()!=null&&x.getFoodCategory().equalsIgnoreCase(y.getFoodCategory())){s+=30;w.add("category");}
if("CRITICAL".equalsIgnoreCase(y.getUrgencyLevel())){s+=25;w.add("critical urgency");}else if("HIGH".equalsIgnoreCase(y.getUrgencyLevel()))s+=20;else s+=10;
if(x.getCity()!=null&&x.getCity().equalsIgnoreCase(y.getCity())){s+=15;w.add("same city");}
if(x.getQuantity()!=null&&y.getQuantityRequired()!=null&&x.getQuantity()>=y.getQuantityRequired()){s+=10;w.add("quantity sufficient");}
if(x.getExpiryTime()!=null){long h=Duration.between(LocalDateTime.now(),x.getExpiryTime()).toHours();if(h<=2)s+=20;else if(h<=6)s+=15;else if(h<=12)s+=10;else s+=5;}
FoodMatch m=new FoodMatch();m.setDonationId(id);m.setRecipientId(y.getId());m.setMatchScore(Math.round(s*100.0)/100.0);m.setMatchReason(String.join(", ",w));out.add(repo.save(m));}out.sort(Comparator.comparing(FoodMatch::getMatchScore).reversed());return out;}
public List<FoodMatch> get(String id){return repo.findByDonationId(id);}}