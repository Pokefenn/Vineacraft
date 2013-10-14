package pokefenn.item.thaumcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import pokefenn.item.ItemVineacraft;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.wands.IWandFocus;

public class ItemVineHookFocus extends ItemVineacraft implements IWandFocus {

	public ItemVineHookFocus(int id) {
		super(id);

	}

	@Override
	public int getFocusColor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Icon getFocusDepthLayerIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icon getOrnament() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WandFocusAnimation getAnimation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AspectList getVisCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isVisCostPerTick() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemStack onFocusRightClick(ItemStack itemstack, World world,
			EntityPlayer player, MovingObjectPosition movingobjectposition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onUsingFocusTick(ItemStack itemstack, EntityPlayer player,
			int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerStoppedUsingFocus(ItemStack itemstack, World world,
			EntityPlayer player, int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSortingHelper(ItemStack itemstack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onFocusBlockStartBreak(ItemStack itemstack, int x, int y,
			int z, EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acceptsEnchant(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
