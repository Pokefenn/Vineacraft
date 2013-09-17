package pokefenn.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileVineaFurnace;

public class ContainerVineaFurnace extends Container {

	private TileVineaFurnace vineaFurnace;
	
	public ContainerVineaFurnace(InventoryPlayer inventoryPlayer, TileVineaFurnace tileVineaFurnace){
	
		//Adds First slot
		this.addSlotToContainer(new Slot(tileVineaFurnace, TileVineaFurnace.INPUT_INVENTORY_INDEX, 56, 35));
		
		//Adds Second slot
		this.addSlotToContainer(new Slot(tileVineaFurnace, TileVineaFurnace.OUTPUT_INVENTORY_INDEX, 116, 35));
		
		
		// Add the player's inventory slots to the container
        for (int inventoryRowIndex = 0; inventoryRowIndex < 3; ++inventoryRowIndex) {
            for (int inventoryColumnIndex = 0; inventoryColumnIndex < 9; ++inventoryColumnIndex) {
                this.addSlotToContainer(new Slot(inventoryPlayer, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 8 + inventoryColumnIndex * 18, 84 + inventoryRowIndex * 18));
            }
        }

        // Add the player's action bar slots to the container
        for (int actionBarSlotIndex = 0; actionBarSlotIndex < 9; ++actionBarSlotIndex) {
            this.addSlotToContainer(new Slot(inventoryPlayer, actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 142));
        }
    }
		
		
	
	
	
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}

    

}
