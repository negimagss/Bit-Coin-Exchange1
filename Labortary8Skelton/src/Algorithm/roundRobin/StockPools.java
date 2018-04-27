/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.roundRobin;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class StockPools {
    Random someRandGen = new Random();
    TreeMap<Integer, StockValueDetails> pool;
    int totalWeight;

    public void init(ArrayList<StockValueDetails> servers) {
        this.pool = new TreeMap<Integer, StockValueDetails>();
        // create the "weighted selection" list
        totalWeight = 0;
        for(StockValueDetails s : servers) {
            //  associate each server with the sum of the weights so far
            totalWeight += s.getWeight();
            this.pool.put(totalWeight, s);
        }
    }

    public StockValueDetails getNext() {
        int rnd = someRandGen.nextInt(this.totalWeight);
        return pool.ceilingEntry(rnd).getValue();
    }
}
