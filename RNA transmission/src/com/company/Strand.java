package com.company;

 public class Strand {

        public static String complementaryStrand(String s) {
            StringBuilder cStrand = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                Character temp = s.charAt(i);
                if(temp == 'A' || temp == 'a'){
                    temp = 'T';
                } else if (temp == 'T' || temp == 't'){
                    temp = 'A';
                } else if (temp == 'C' || temp == 'c') {
                    temp ='G';
                } else if(temp == 'G' || temp == 'g') {
                    temp = 'C';
                } else if(temp == ' ') {

                } else  {
                    System.out.println(temp + " nie jest nukloetydem.");
                    return("");
                }
                cStrand.append(temp);
            }
            return cStrand.toString();
        }


        public static String mRNA(String s) {
            StringBuilder cStrand = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                Character temp = s.charAt(i);
                if(temp == 'A' || temp == 'a'){
                    temp = 'U';
                } else if (temp == 'T' || temp == 't'){
                    temp = 'A';
                } else if (temp == 'C' || temp == 'c') {
                    temp ='G';
                } else if(temp == 'G' || temp == 'g') {
                    temp = 'C';
                } else if(temp == ' ') {

                } else  {
                    System.out.println(temp + " nie jest nukleotydem.");
                    return("");
                }
                cStrand.append(temp);
            }
            return cStrand.toString();
        }

    }
