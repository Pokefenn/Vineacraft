package pokefenn.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockTempVine extends Block {

	
    public BlockTempVine(int id) {
        
        super(id, Material.glass);
        this.setUnlocalizedName(Strings.TEMP_VINE_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.setHardness(1F);
    }
	

	
	    @SideOnly(Side.CLIENT)
		private Icon allSidesIcon;
		
		@SideOnly(Side.CLIENT)
		@Override
		public void registerIcons(IconRegister register){
			allSidesIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.TEMP_VINE);
		
		}
		
		@SideOnly(Side.CLIENT)
		@Override
		public Icon getIcon(int side, int meta) {
			return allSidesIcon;
			
			
		}
		
		public boolean isOpaqueCube(){
	    
	        return false;
	        
	    }
		
		
		public void updateTick(World world, int x, int y, int z, Random rand){
	    
			super.updateTick(world, x, y, z, rand);
			
		    if (rand.nextInt(20) == 0) {
		    	
		    	world.setBlockToAir(x, y, z);
		    }
			
	        
	    }
	
}
