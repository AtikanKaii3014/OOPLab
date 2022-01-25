class Pro1_64010956{
    public static void main(String[] args) {
        long sec,birth,death,immigrant;
        long current = 312032486; 
        sec=5*365*24*60*60;
        birth = sec / 7;
        death = sec / 13;
        immigrant = sec / 45;
        current = current + birth - death + immigrant;
        System.out.println(current);
    }
}