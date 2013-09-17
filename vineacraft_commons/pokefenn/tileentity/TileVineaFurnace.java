package pokefenn.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import pokefenn.lib.Strings;

public class TileVineaFurnace extends TileVineacraft implements IInventory, IFluidHandler {

	private ItemStack[] inventory;

    public static final int INVENTORY_SIZE = 3;
    
    public static final int INPUT_INVENTORY_INDEX = 0;
    public static final int BUCKET_INVENTORY_INDEX = 1;
    public static final int OUTPUT_INVENTORY_INDEX = 2;
	
	
	
	
	public TileVineaFurnace() {

		inventory = new ItemStack[INVENTORY_SIZE];
		
	}
	
	//Methods are from IInventory
	
	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slotIndex) {
		return inventory[slotIndex];
	}

	@Override
	public ItemStack decrStackSize(int slotIndex, int decrementAmount) {
		
		ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null) {
            if (itemStack.stackSize <= decrementAmount) {
                setInventorySlotContents(slotIndex, null);
            }
            else {
                itemStack = itemStack.splitStack(decrementAmount);
                if (itemStack.stackSize == 0) {
                    setInventorySlotContents(slotIndex, null);
                }
            }
        }

        return itemStack;
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int slotIndex) {
		
		  ItemStack itemStack = getStackInSlot(slotIndex);
	        if (itemStack != null) {
	            setInventorySlotContents(slotIndex, null);
	        }
	        return itemStack;
	    }
		


	@Override
	public void setInventorySlotContents(int slotIndex, ItemStack itemStack) {
		
		 inventory[slotIndex] = itemStack;
	        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
	            itemStack.stackSize = getInventoryStackLimit();
	        }
	    }

	

	@Override
	public String getInvName() {
		return Strings.CONTAINER_VINEA_FURNACE_NAME;
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
	public void openChest() {
	}

	@Override
	public void closeChest() {
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return false;
		
	}

	
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return true;
	}

	

	

	@Override
	public void onInventoryChanged() {
		
		worldObj.updateAllLightTypes(xCoord, yCoord, zCoord);

        if (worldObj.getBlockTileEntity(xCoord, yCoord + 1, zCoord) instanceof TileVineaFurnace) {
            worldObj.updateAllLightTypes(xCoord, yCoord + 1, zCoord);
        }
    }
	

	//After this the methods are for IFluidRegistry

	
	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return 0;
	}


	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		return null;
	}


	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		return null;
	}


	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}


	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return false;
	}


	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return null;
	}
    
	//Furnace stuff
	
	public boolean canSmelt(){
		return false;
		
		
	}
    
	public static int getItemBurnTime(ItemStack par0ItemStack){
		
		return 0;
		
	}

	
	
}
