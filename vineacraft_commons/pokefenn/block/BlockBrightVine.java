package pokefenn.block;

import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockBrightVine extends BlockVine {
	
	
	public BlockBrightVine(int id) {
		super(id);
		this.setUnlocalizedName(Strings.BRIGHT_VINE_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
		this.setHardness(1F);
		this.setLightValue(1F);
	}

	
	    @SideOnly(Side.CLIENT)
		private Icon allSidesIcon;
		
		@SideOnly(Side.CLIENT)
		@Override
		public void registerIcons(IconRegister register){
			allSidesIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.BRIGHT_VINE);
		
		}
		
		@SideOnly(Side.CLIENT)
		@Override
		public Icon getIcon(int side, int meta) {
			return allSidesIcon;
			
			
		}
	
	
	}
	

		
		
	
	
	




