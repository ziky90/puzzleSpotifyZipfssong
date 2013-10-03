package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author zikesjan
 */
public class Solution {

    private static int toBeSelected;
    private static List<Song> results = new ArrayList<Song>();
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            readFromStdInFast();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Collections.sort(results);
        
        StringBuilder sb = new StringBuilder();
                
        for (int i = 0; i < toBeSelected; i++) {
            sb.append(results.get(i).getName()).append('\n');
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
    
    
    /**
     * just reading of the data from the system and creating the ranking
     */
    static void readFromStdInFast() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int songs = Integer.parseInt(st.nextToken());
        toBeSelected = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < songs; i++) {
            st = new StringTokenizer(br.readLine());
            Song s = new Song(Long.parseLong(st.nextToken()), st.nextToken(), i+1);
            results.add(s);
        }
    }
}
