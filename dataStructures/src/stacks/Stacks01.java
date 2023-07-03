package stacks;
import java.util.Stack;
public class Stacks01 {


    public static void main(String[] args){

        /**
         * stack = LIFO data structure. Last-in First-Out
         * stores objects into a sort of 'vertical tower'
         * push() to add to the top
         * pop() to remove from the top
         *
         */

            Stack<String> stack = new Stack<String>();

            stack.push("Minecraft");
            stack.push("Skyrim");
            stack.push("DOOM");
            stack.push("Borderlands");
            stack.push("FFVII");

            System.out.println("topmost peek: "+stack.peek());
            System.out.println("full stack: "+stack);
            System.out.println("is empty: "+stack.empty());
            System.out.println("search for FFVII: "+stack.search("FFVII"));
            System.out.println("search for DOOM: "+stack.search("DOOM"));

            System.out.println("search for firstElement: "+stack.firstElement());
            System.out.println("search for lastElement: "+stack.lastElement());

            while (stack.empty() == false) {
                System.out.println(stack.pop());
            }

            for(int i=1;i>0;i++){
                stack.push("Minecraft");
            }
            System.out.println("is empty: "+stack.empty());

        }
}
