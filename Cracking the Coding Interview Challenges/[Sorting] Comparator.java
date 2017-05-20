/* Source: https://www.hackerrank.com/challenges/ctci-comparator-sorting  */

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;
        int sortOrder = p1.score == p2.score ? p2.name.compareTo(p1.name) : p1.score - p2.score;
        return  sortOrder > 0 ? -1 : 1;
    }
}