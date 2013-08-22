package pokefenn.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import pokefenn.tileentity.TileVineaFurnace;

public class ContainerVineaFurnace extends Container {

	public ContainerVineaFurnace(InventoryPlayer inventoryPlayer, TileVineaFurnace vineaFurnace){
	

	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
}
