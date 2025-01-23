public class compareTo<T>{


    public int compareToo(T val1 , T val2){
        if(val1 instanceof String && val2 instanceof String ){

            return compareString(val1 ,val2);

        }else if(val1 instanceof Integer  && val2  instanceof Integer  ){
            return compareInteger(val1 ,  val2);
        }else if(val1 instanceof Double  && val2  instanceof Double  ){
            return  compareDouble(val1 ,  val2);
        }

        // this is if the words are the same as one another
        return 0;
    }


    private int compareString(T val1 , T val2){
        // to stop any comparison issues with the letters being compared as all lower case letters come first
        String strval1 = ((String) val1).toLowerCase();
        String strval2 = ((String) val2).toLowerCase();
        // getting the lengths of the words and then the min length for the loop
        int leng1 = strval1.length();
        int leng2 = strval2.length();
        int minLeng = Math.min(leng1 , leng2);

        // loop for comparison of the letters within the two words
        for(int i = 0; i < minLeng; i++){
            char char1 = strval1.charAt(i);
            char char2 = strval2.charAt(i);

            if(char1 != char2){

                if(char1 > char2 ){
                    // this means the letter comes before the other
                    return 1;
                }else {
                    // means it comes after
                    return -1;
                }
            }
        }

        return 0;
    }


    private int compareInteger(T val1 , T val2){
        Integer Ival1 = (Integer) val1;
        Integer Ival2 = (Integer) val2;

        if(Ival1 > Ival2) return 1;

        else if(Ival1 < Ival2) return -1;

        else return 0;


    }
    private int compareDouble(T val1 , T val2){
        Double Ival1 = (Double) val1;
        Double Ival2 = (Double) val2;

        if(Ival1 > Ival2) return 1;

        else if(Ival1 < Ival2) return -1;

        else return 0;


    }
}
