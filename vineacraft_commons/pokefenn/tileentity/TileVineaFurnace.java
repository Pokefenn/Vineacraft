package pokefenn.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import pokefenn.lib.Strings;

public class TileVineaFurnace extends TileVineacraft implements IInventory, IFluidHandler, ISidedInventory {

	private ItemStack[] inventory;
	private FluidStack[] fluid;
	
	public static final int MAX_FLUID = FluidContainerRegistry.BUCKET_VOLUME * 10;

    public static final int INVENTORY_SIZE = 2;
    
    public static final int INPUT_INVENTORY_INDEX = 0;
    //public static final int BUCKET_INVENTORY_INDEX = 2;
    public static final int OUTPUT_INVENTORY_INDEX = 1;
    
	
	
	
	
	public TileVineaFurnace() {

		inventory = new ItemStack[INVENTORY_SIZE];
		fluid = new FluidStack[MAX_FLUID];
		

		
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
		
		//Not chest so no code
		
	}

	
	@Override
	public void closeChest() {
		
		//Not chest so no code
	}
	
	@Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {

        super.readFromNBT(nbtTagCompound);

        // Read in the ItemStacks in the inventory from NBT
        NBTTagList tagList = nbtTagCompound.getTagList("Items");
        inventory = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < tagList.tagCount(); ++i) {
            NBTTagCompound tagCompound = (NBTTagCompound) tagList.tagAt(i);
            byte slotIndex = tagCompound.getByte("Slot");
            if (slotIndex >= 0 && slotIndex < inventory.length) {
                inventory[slotIndex] = ItemStack.loadItemStackFromNBT(tagCompound);
            }
        }
    }
	
	
	@Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {

        super.writeToNBT(nbtTagCompound);

        // Write the ItemStacks in the inventory to NBT
        NBTTagList tagList = new NBTTagList();
        for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
            if (inventory[currentIndex] != null) {
                NBTTagCompound tagCompound = new NBTTagCompound();
                tagCompound.setByte("Slot", (byte) currentIndex);
                inventory[currentIndex].writeToNBT(tagCompound);
                tagList.appendTag(tagCompound);
            }
        }
        nbtTagCompound.setTag("Items", tagList);
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
		
		
		
		
		
		return MAX_FLUID;
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
		return true;
	}


	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return null;
	}
    
	//Furnace stuff
	
	public boolean canSmelt(){
		return true;
		
		
	}
	
	
	public static int getItemBurnTime(ItemStack par0ItemStack){
		
		return 0;
		
	}

	//ISidedInventory methods.
	
	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return null;
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemstack, int j) {
		return true;
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {

		return true;
	}

	
	
}
