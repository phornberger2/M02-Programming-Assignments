public class Bin2Dec {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;
        for (int i = 0, j = binaryString.length() - 1;
             i < binaryString.length(); i++, j--) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
                throw new BinaryFormatException(binaryString);
            decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i))))
                    * Math.pow(2, j);
        }
        return decimal;
    }

}
