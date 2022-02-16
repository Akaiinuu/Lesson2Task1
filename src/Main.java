public class Main {
    public static void main(String[] args) {
        MileService service = new MileService();
        int bonusMiles = service.milesCalculate(20_000, 20);
        System.out.println(bonusMiles);
    }
}
//             ----- По примеру из описания задачи в разделе "Этапы выполнения" -----
//
//public class Main {
//    public static void main(String[] args) {
//        MileService service = new MileService();
//        int price = 10_000;
//        int miles = service.calculate(price);
//        System.out.println(miles);
//    }
//}


