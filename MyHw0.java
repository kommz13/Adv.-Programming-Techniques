import java.util.*;

public class MyHw0 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, List<Integer>> n = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String row = input.nextLine();
            List<Integer> l = new ArrayList<>();
            String[] feed = row.split("\\|");
            int f = Integer.parseInt(feed[0]);
            int s = Integer.parseInt(feed[1]);
            if (n.containsKey(f)) {
                if (!n.get(f).contains(s)) {
                    n.get(f).add(s);
                }
            } else {
                n.put(f, l);
                n.get(f).add(s);
            }
        }
        for (Map.Entry<Integer, List<Integer>> i : n.entrySet()) {
            System.out.println(i.getKey() + "|" + i.getValue().size());
        }
    }
}






