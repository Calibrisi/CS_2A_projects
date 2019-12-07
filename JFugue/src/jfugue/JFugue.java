/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfugue;

import org.jfugue.player.Player;

/**
 *
 * @author god
 */
public class JFugue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ");
    }
    
}
