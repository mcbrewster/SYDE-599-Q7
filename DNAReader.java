public class DNAReader {
    private static String templateStrand = "";
    private static String complmentaryStrand = "";
    private static String mRNA = "";

    public static void main(String args[]) {
        if(args.length < 1){
            System.out.println("please privide a template strand");
            System.exit(0); 
        }
        templateStrand = args[0]; 
        
        for(int i = 0; i < templateStrand.length(); i++){
            char current = templateStrand.charAt(i); 
            switch(current) {
                case 'A':
                complmentaryStrand += "T";
                mRNA += "A";
                  break;
                case 'C':
                complmentaryStrand += "G";
                mRNA += "C";
                  break;
                case 'T':
                complmentaryStrand += "A";
                mRNA += "U";
                break;
                case 'G':
                complmentaryStrand += "C";
                mRNA += "G";
                  break;
                default:
                  // do nothing
              }
        }

        System.out.println("Complimentary Strand: " + complmentaryStrand);
        System.out.println("mRNA: " + mRNA);


    }
}

