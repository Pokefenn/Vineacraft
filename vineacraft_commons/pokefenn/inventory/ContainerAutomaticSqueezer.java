package pokefenn.inventory;

import pokefenn.tileentity.TileAutomaticSqueezer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerAutomaticSqueezer extends Container {

    
    private TileAutomaticSqueezer automaticSqueezer;
    
    public ContainerAutomaticSqueezer(InventoryPlayer invPlayer, TileAutomaticSqueezer automaticSqueezer) {
        
        
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return automaticSqueezer.isUseableByPlayer(entityplayer);
    }

}
