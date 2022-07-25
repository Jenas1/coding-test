package programmers.level1;

public class RecommendNewID {
    class Solution {
        public String solution(String new_id) {
            String answer = new_id;
            return filter1(answer);
        }

        public String filter1(String newId) {
            return filter2(newId.toLowerCase());
        }

        public String filter2(String newId) {
            return filter3(newId.replaceAll("[^a-z0-9-_.]",""));
        }

        public String filter3(String newId) {
            return filter4(newId.replaceAll("[.]{2,}","."));

        }

        public String filter4(String newId) {

            String result = newId.replaceAll("^[.]|[.]$","");


            return filter5(result);

        }

        public String filter5(String newId) {

            return (newId.isEmpty()) ?
                    filter6(newId.replaceAll("","a")) : filter6(newId);
        }

        public String filter6(String newId) {
            if(newId.length() >= 16) {

                String result = newId
                        .substring(0,15)
                        .replaceAll("[.]$", "");

                return filter7(result);
            }

            return filter7(newId);

        }

        public String filter7(String newId) {

            if(newId.length() <= 2) {

                while (newId.length() < 3) {

                    newId += newId.charAt(newId.length()-1);
                }
            }
            return  newId;
        }
    }
}
