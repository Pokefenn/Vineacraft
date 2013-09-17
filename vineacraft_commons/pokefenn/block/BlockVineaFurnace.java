package pokefenn.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import pokefenn.Vineacraft;
import pokefenn.lib.GuiIds;
import pokefenn.lib.Strings;
import pokefenn.tileentity.TileAutomaticSqueezer;
import pokefenn.tileentity.TileVineaFurnace;
import pokefenn.tileentity.TileVineacraft;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVineaFurnace extends BlockVineacraft {

    public BlockVineaFurnace(int id) {
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.VINEA_FURNACE_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setHardness(5F);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileVineaFurnace();
    }

    
    @SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	@SideOnly(Side.CLIENT)
	private Icon frontIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		topIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.ADVANCED_MACHINE_BLOCK_TOP);
		sideIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.ADVANCED_MACHINE_BLOCK_SIDE);
		frontIcon = register.registerIcon(ModBlocks.TEXTURE_LOCATION + ":" + ModBlocks.VINEA_FURNACE_FRONT);
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if(side == 0 ){
			return topIcon;
		}else if(side == 1) {
			return topIcon;
		}else if(side == 3){
			return frontIcon;
		}else{return sideIcon;
			
		
		
	}
	
	
}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		
		   if (player.isSneaking())
	            return false;
	        else {
	            if (!world.isRemote) {
	                TileVineaFurnace tileVineaFurnace = (TileVineaFurnace) world.getBlockTileEntity(x, y, z);

	                if (tileVineaFurnace != null) {
	                    player.openGui(Vineacraft.instance, GuiIds.VINEA_FURNACE, world, x, y, z);
	                }
	            }

	            return true;
	        }
	    }
	
	
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack) {

        int direction = 0;
        int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

        if (facing == 0) {
            direction = ForgeDirection.NORTH.ordinal();
        }
        else if (facing == 1) {
            direction = ForgeDirection.EAST.ordinal();
        }
        else if (facing == 2) {
            direction = ForgeDirection.SOUTH.ordinal();
        }
        else if (facing == 3) {
            direction = ForgeDirection.WEST.ordinal();
        }

        world.setBlockMetadataWithNotify(x, y, z, direction, 3);

        if (itemStack.hasDisplayName()) {
            ((TileVineacraft) world.getBlockTileEntity(x, y, z)).setCustomName(itemStack.getDisplayName());
        }

        ((TileVineacraft) world.getBlockTileEntity(x, y, z)).setOrientation(direction);
    }
}

    
    
    

