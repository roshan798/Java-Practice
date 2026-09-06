import java.util.*;

public class DialingCodes {
    private Map<Integer,String> codeToCountry;
    private Map<String,Integer> countryToCode;

    
    public DialingCodes() {
        codeToCountry = new HashMap<>();
        countryToCode = new HashMap<>();
    }
    public Map<Integer, String> getCodes() {
        return codeToCountry;
    }

    public void setDialingCode(Integer code, String country) {
        codeToCountry.put(code,country);
        countryToCode.put(country,code);
    }

    public String getCountry(Integer code) {
        return codeToCountry.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!codeToCountry.containsKey(code) && !countryToCode.containsKey(country)){
            setDialingCode(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        if(countryToCode.containsKey(country)) 
            return countryToCode.get(country);
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if(oldCode!=null) {
            setDialingCode(code,country);
            codeToCountry.remove(oldCode);
        }
    }
}
