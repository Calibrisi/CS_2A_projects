package encryption;

public class Crypto {

    public String encrypt(String toEncrypt) {
        
        String toRet = toEncrypt.replaceAll("v", "ay’,r");
        toRet = toRet.replaceAll("V", "ay’,r");
        toRet = toRet.replaceAll("m", "ssad");
        toRet = toRet.replaceAll("M", "ssad");
        toRet = toRet.replaceAll("g", "jef..w");
        toRet = toRet.replaceAll("G", "jef..w");
        toRet = toRet.replaceAll("b", "dug>");
        toRet = toRet.replaceAll("B", "dug>");
        
        return toRet;
    }

    public String decrypt(String toDecrypt) {
        
        String toRet = toDecrypt.replaceAll("ay’,r", "v");
        toRet = toRet.replaceAll("ssad", "m");
        toRet = toRet.replaceAll("jef..w", "g");
        toRet = toRet.replaceAll("dug>", "b");
        
        return toRet;
    }
    
}