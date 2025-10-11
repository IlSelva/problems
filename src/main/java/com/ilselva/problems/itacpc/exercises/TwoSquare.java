package com.ilselva.problems.itacpc.exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class TwoSquare {

    public static void findNumberOfPairs(int size, Kattio br) {
        Map<Long, Integer> freq = new HashMap<>();

        for (int i = 0; i < size; i++) {
            long d = br.getLong() - br.getLong();
            freq.put(d, freq.getOrDefault(d, 0) + 1);
        }

        long result = 0L;
        for (Integer e : freq.values()) {
            if (e >= 2) {
                result += ((long) e * (e - 1)) / 2;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        //Kattio reader = new Kattio(System.in);
        Kattio reader = new Kattio(Files.newInputStream(Paths.get(
                "src/test/resources/itacpc/TwoSquare/1.in")));
        int n = reader.getInt();

        findNumberOfPairs(n, reader);

        reader.close();
    }

    public static class Kattio extends PrintWriter {
        public Kattio(InputStream i) {
            super(new BufferedOutputStream(System.out));
            r = new BufferedReader(new InputStreamReader(i));
        }

        public Kattio(InputStream i, OutputStream o) {
            super(new BufferedOutputStream(o));
            r = new BufferedReader(new InputStreamReader(i));
        }

        public boolean hasMoreTokens() {
            return peekToken() != null;
        }

        public int getInt() {
            return Integer.parseInt(nextToken());
        }

        public double getDouble() {
            return Double.parseDouble(nextToken());
        }

        public long getLong() {
            return Long.parseLong(nextToken());
        }

        public String getWord() {
            return nextToken();
        }


        private BufferedReader r;
        private String line;
        private StringTokenizer st;
        private String token;

        private String peekToken() {
            if (token == null)
                try {
                    while (st == null || !st.hasMoreTokens()) {
                        line = r.readLine();
                        if (line == null) return null;
                        st = new StringTokenizer(line);
                    }
                    token = st.nextToken();
                } catch (IOException e) {
                }
            return token;
        }

        private String nextToken() {
            String ans = peekToken();
            token = null;
            return ans;
        }
    }

}