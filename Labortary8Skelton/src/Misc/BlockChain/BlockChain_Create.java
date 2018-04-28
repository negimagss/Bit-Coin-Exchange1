/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc.BlockChain;

import static Misc.BlockChain.BlockChain.blockchain;
import static Misc.BlockChain.BlockChain.difficulty;
import static Misc.BlockChain.BlockChain.isChainValid;
import com.google.gson.GsonBuilder;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class BlockChain_Create {
 
    
    
    
    public void blockChain(String sMessage, int x){
        //add our blocks to the blockchain ArrayList:
		if(x==0){
		blockchain.add(new Block(sMessage, "0"));
		System.out.println("Trying to Mine block 1... ");
		blockchain.get(0).mineBlock(difficulty);
                }
                else{
		blockchain.add(new Block(sMessage,blockchain.get(blockchain.size()-1).hash));
		System.out.println("Trying to Mine block 2... ");
		blockchain.get(1).mineBlock(difficulty);
                }
//		blockchain.add(new Block("Hey im the third block",blockchain.get(blockchain.size()-1).hash));
//		System.out.println("Trying to Mine block 3... ");
//		blockchain.get(2).mineBlock(difficulty);	
		
		System.out.println("\nBlockchain is Valid: " + isChainValid());
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println("\nThe block chain: ");
		System.out.println(blockchainJson);
    }
    
    public boolean isChainValid1()
    {
        return isChainValid();
    }
    
    
}
