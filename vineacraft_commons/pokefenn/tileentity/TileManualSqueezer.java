package pokefenn.tileentity;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class TileManualSqueezer extends TileVineacraft implements IInventory {

    private ItemStack[] items;
    
    public TileManualSqueezer() {
        
        items = new ItemStack[3];
    }
    
    @Override
    public int getSizeInventory() {
        return items.length;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return items[i];
    }

    @Override
    public ItemStack decrStackSize(int i, int count) {
        ItemStack itemstack = getStackInSlot(i);
        
        if (itemstack!= null) {
            if (itemstack.stackSize <= count) {
                setInventorySlotContents(i,null);
                
                
            }else{
                itemstack = itemstack.splitStack(count);
                onInventoryChanged();
            }
        }
        return itemstack;
        
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
        ItemStack item = getStackInSlot(i);
        setInventorySlotContents(i, null);
        
        return item;
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {
       items[i] = itemstack;   
       
       if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
           itemstack.stackSize = getInventoryStackLimit();
           
       }
       
       onInventoryChanged();
       
    }

    @Override
    public String getInvName() {
        return "ManualSqueezer";
    }

    @Override
    public boolean isInvNameLocalized() {   
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return entityplayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
        
    }
    
    @Override
    public void openChest() {}

    @Override
    public void closeChest() {}


	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return false;
	}

}
