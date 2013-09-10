package pokefenn.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import pokefenn.tileentity.TileAutomaticSqueezer;

public class ContainerAutomaticSqueezer extends Container {

	private TileAutomaticSqueezer automaticSqueezer;
	
	public ContainerAutomaticSqueezer(InventoryPlayer invPlayer, TileAutomaticSqueezer automaticSqueezer){
		this.automaticSqueezer = automaticSqueezer;
		
	
		for(int x = 0; x < 9; x++) {
			
			addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 130));

		}
		
		for (int y = 0; y < 3; y++) {
			
			for (int x = 0; x < 9; x++){
				
				addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 72 + y * 18));
				
			}
			
		}
		
	}
	
	
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return automaticSqueezer.isUseableByPlayer(entityplayer);
	}

    

}
