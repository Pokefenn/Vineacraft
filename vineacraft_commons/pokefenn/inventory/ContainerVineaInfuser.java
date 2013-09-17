package pokefenn.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineaInfuser;
import pokefenn.tileentity.TileVineacraft;


public class ContainerVineaInfuser extends Container {

private TileVineaFurnace vineaFurnace;

public ContainerVineaInfuser(InventoryPlayer inventoryPlayer, TileVineaInfuser tileVineaInfuser){

	//Adds First slot
	this.addSlotToContainer(new Slot(tileVineaInfuser, TileVineaInfuser.INPUT_INVENTORY_INDEX, 79, 17));
	
	//Adds Second slot
	this.addSlotToContainer(new Slot(tileVineaInfuser, TileVineaInfuser.OUTPUT_INVENTORY_INDEX, 79, 51));
	
	
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
