class Solution {
    public int romanToInt(String s) {
        int Final = 0;
        Map<String, Integer> RomanMap = new HashMap<String, Integer>();
        RomanMap.put("I", 1);
        RomanMap.put("V", 5);
        RomanMap.put("X", 10);
        RomanMap.put("L", 50);
        RomanMap.put("C", 100);
        RomanMap.put("D", 500);
        RomanMap.put("M", 1000);
        //char[] RomanList = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            //System.out.println(s.charAt(i));
            //System.out.println(RomanMap.get(String.valueOf(s.charAt(i))));
            if (i != s.length()-1){
                if (s.charAt(i) == 'I'){
                    System.out.println("HERE");
                    if (s.charAt(i+1)== 'V'){
                        System.out.println("THERE");
                        Final = Final + 4;
                        i++;
                    }
                    else if (s.charAt(i+1)== 'X'){
                        Final = Final + 9;
                        i++;
                    }
                    else{
                        Final = Final+RomanMap.get(String.valueOf(s.charAt(i)));
                    }
                }
                else if (s.charAt(i) == 'X'){
                    if (s.charAt(i+1)== 'L'){
                        Final = Final + 40;
                        i++;
                    }
                    else if (s.charAt(i+1)== 'C'){
                        Final = Final + 90;
                        i++;
                    }
                    else{
                        Final = Final+RomanMap.get(String.valueOf(s.charAt(i)));
                    }
                }
                else if (s.charAt(i) == 'C'){
                    if (s.charAt(i+1) == 'D'){
                        Final = Final + 400;
                        i++;
                    }
                    else if (s.charAt(i+1) == 'M'){
                        Final = Final + 900;
                        i++;
                    }
                    else{
                        Final = Final+RomanMap.get(String.valueOf(s.charAt(i)));
                    }
                }
                else{
                    Final = Final+RomanMap.get(String.valueOf(s.charAt(i)));
                }
            }
            else{
                Final = Final+RomanMap.get(String.valueOf(s.charAt(i)));
            }
            System.out.println(Final);
        }

        System.out.println(s);
        return Final;
    }
}