package codewar;

class Challenge {
    public static String numberToOrdinal(Integer number) {
        String sb = number.toString();
        // StringBuilder sb = new StringBulder(number);
        if(sb.endsWith("0")){
            return "0";
        }else if(sb.endsWith("1")){
            return sb.concat("st");
        }else if(sb.endsWith("2")){
            return sb.concat("nd");
        }else if(sb.endsWith("3")){
            return sb.concat("rd");
        }else if(sb.length() >1 && sb.endsWith("1")||sb.endsWith("2")||sb.endsWith("3")){
            return sb.concat("th");
        }

        return sb.concat("th");
        //return "";
    }
}
