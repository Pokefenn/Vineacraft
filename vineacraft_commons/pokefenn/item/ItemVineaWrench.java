package pokefenn.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import buildcraft.api.tools.IToolWrench;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVineaWrench extends ItemVineacraft implements IToolWrench {

    public ItemVineaWrench(int id){
        
        super(id);
        this.setUnlocalizedName(Strings.VINEA_WRENCH_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setMaxStackSize(1);
    }
    
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
    	
    	itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINEA_WRENCH_ICON);       
    	
    	
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Used to rotate machines!");
    }


	@Override
	public boolean canWrench(EntityPlayer player, int x, int y, int z) {
		return true;
	}


	@Override
	public void wrenchUsed(EntityPlayer player, int x, int y, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		int blockId = world.getBlockId(x, y, z);
		Block block = Block.blocksList[blockId];

		if(block == null)
			return false;


		if (block.rotateBlock(world, x, y, z, ForgeDirection.getOrientation(side))) {
			player.swingItem();
			return !world.isRemote;
		}
		return false;
	}
	
	@Override
	public boolean shouldPassSneakingClickToBlock(World par2World, int par4, int par5, int par6) {
		return true;
	}
	
}
