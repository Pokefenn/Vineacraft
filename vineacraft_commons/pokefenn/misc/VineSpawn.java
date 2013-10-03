package pokefenn.misc;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.FakePlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class VineSpawn implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		//This code makes you spawn in the world with a vine!
		
		NBTTagCompound tags = player.getEntityData();
		
		
		
            ItemStack vine = new ItemStack(Block.vine);
            if (!player.inventory.addItemStackToInventory(vine)) {
            
                spawnItemAtPlayer(player, vine);
            }
        
		
		
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		
	}
	
	 public static void spawnItemAtPlayer (EntityPlayer player, ItemStack stack)
	    {
	        EntityItem entityitem = new EntityItem(player.worldObj, player.posX + 0.5D, player.posY + 0.5D, player.posZ + 0.5D, stack);
	        player.worldObj.spawnEntityInWorld(entityitem);
	        if (!(player instanceof FakePlayer))
	            entityitem.onCollideWithPlayer(player);

}
}
