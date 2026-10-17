public class Strings {
    public static void main(String [] args){
        String firstName = "Riman";
        String lastName  = "Maharjan";

        String firstName2 = "Raq";

        //concatenation

        String fullName = firstName + " " + lastName;

        System.out.print(fullName);
        System.out.println(" Length: " + fullName.length());

        if(firstName.compareTo(firstName2) == 0 ){
            System.out.println("Strings are equal.");
        }
        else if(firstName.compareTo(firstName2) < 0){
            System.out.println("Second String is greater.");
        }
        else{
            System.out.println("First String is greater.");
        }

        //Strings are immutable
        
        StringBuilder sb = new StringBuilder("toy");
        System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.insert(2, 'n');
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        //.delete(start, end) .append("")

        //Reverse
        for(int i=0; i < sb.length()/2; i++){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1, temp);
        }
        System.out.println(sb);
    }
}
