class SqueakyClean {
    public static  char leetSpeekChar(char c) {
        return switch(c){
            case '4'->'a'; 
            case '3'->'e';
            case '0'->'o';
            case '1'->'l';
            case '7'->'t';
            default -> c;
        };
    }
    static String clean(String identifier) {
        char[] idsArray = identifier.toCharArray();
        StringBuilder sb = new StringBuilder();
        int  n = idsArray.length;
        int lastCharAt = n;

        for(int i=0;i<n;i++) {
            char c = idsArray[i];
            
            if(Character.isWhitespace(c)){
                sb.append('_');
                lastCharAt = i;

            }else if(Character.isLetter(c)) {
                if((i - lastCharAt) > 1) 
                    sb.append(Character.toUpperCase(c));
                else 
                    sb.append(c);
                lastCharAt = i;
            }
            else if(Character.isDigit(c)){
                sb.append(leetSpeekChar(c));
                lastCharAt = i;
            }else if(c!='-'){
                lastCharAt = i;
                
            }
            // else {
            //     // // sb.append(c);

            // }
        }
        return sb.toString();
    }
}
