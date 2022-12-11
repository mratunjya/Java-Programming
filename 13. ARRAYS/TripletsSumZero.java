public class TripletsSumZero {
    public static void main(String[] args) {
        int n[] = { -1, 0, 1, 2, -1, -4 };
        int len = n.length;
        String allPairs[] = new String[2 * (len * len - 6 * len + 10)];
        int allPairsFilled = -1;

        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (n[i] + n[j] + n[k] == 0) {
                        String pair = n[i] + "," + n[j] + "," + n[k] + ",";
                        allPairs[++allPairsFilled] = pair;
                    }
                }
            }
        }

        for (int i = 0; i <= allPairsFilled; i++) {
            String pair = allPairs[i];
            int n3[] = new int[3];
            int count = -1;
            String tempStr = "";

            for (int j = 0; j < pair.length(); j++) {
                if (pair.charAt(j) == ',') {
                    n3[++count] = Integer.parseInt(tempStr);
                    tempStr = "";
                } else {
                    tempStr += pair.charAt(j);
                }
            }

            for (int j = i + 1; j <= allPairsFilled; j++) {
                String newPair = allPairs[j];
                count = -1;
                int n3Next[] = new int[3];
                for (int k = 0; k < newPair.length(); k++) {
                    if (newPair.charAt(k) == ',') {
                        n3Next[++count] = Integer.parseInt(tempStr);
                        tempStr = "";
                    } else {
                        tempStr += newPair.charAt(k);
                    }
                }

                int countSimilar = 0;
                for (int p = 0; p < 3; p++) {
                    for (int q = 0; q < 3; q++) {
                        if (n3[p] == n3Next[q])
                            ++countSimilar;
                    }
                }

                if (countSimilar != 3) {
                    System.out.println(pair);
                }
            }
        }
    }
}
