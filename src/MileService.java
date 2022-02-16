public class MileService {
    public int milesCalculate (int ticketPrice, int mileCost){
        int bonusMiles = ticketPrice / mileCost;
        return bonusMiles;
    }
}
//              ----- По примеру из описания задачи в разделе "Этапы выполнения" -----
//
//public class MileService{
//    public int calculate (int price){
//        int mileCost = 20;
//        int miles = price / mileCost;
//        return miles;
//    }
//}
