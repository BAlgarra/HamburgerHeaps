package Oct25PracticeProblems.Brandon;

import java.util.*;

public class onaveragetheyrepurple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int end = in.nextInt();
        int edges = in.nextInt();

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for(int i = 0; i < end; i++){
            adjacencyList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int person1 = in.nextInt() - 1;
            int person2 = in.nextInt() - 1;
            adjacencyList.get(person1).add(person2);
            adjacencyList.get(person2).add(person1);
        }

        ArrayList<Integer> marked = new ArrayList<>();
        for (int i = 0; i < end; i++) {
            marked.add(-1);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        marked.set(0, 0);
        while(!queue.isEmpty()){
            int person = queue.poll();
            for(int i = 0; i < adjacencyList.get(person).size(); i++){
                if (marked.get(adjacencyList.get(person).get(i)) == -1){
                    queue.add(adjacencyList.get(person).get(i));
                    marked.set(adjacencyList.get(person).get(i), marked.get(person) + 1);
                }
            }
        }

        System.out.println(marked.get(marked.size() - 1) - 1);
//        System.out.println(marked);
//
//        System.out.println(adjacencyList);


    }
}