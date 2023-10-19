package bridge;

class BMV implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str + " BMV");
    }
}