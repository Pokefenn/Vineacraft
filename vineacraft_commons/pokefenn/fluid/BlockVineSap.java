package pokefenn.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVineSap extends BlockFluidClassic {
	
	
	public BlockVineSap(int id) {
		
		super(id, ModFluids.vineSap, Material.water);
		this.setUnlocalizedName(Strings.BLOCK_VINE_SAP_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
	}
	
	
	
	
	@SideOnly(Side.CLIENT)
    public static Icon vineSapStillIcon;
	public static Icon vineSapFlowingIcon;
	
	@SideOnly(Side.CLIENT)
   	@Override
   	public void registerIcons(IconRegister register){
   		vineSapFlowingIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINE_SAP_STILL);
   		vineSapStillIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.VINE_SAP_FLOWING);
   	
   		stack.getFluid().setIcons(vineSapStillIcon, vineSapFlowingIcon);
   	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		
		if (side <= 1)
			return vineSapStillIcon;
		else
			return vineSapFlowingIcon;
			
		
	}
	}
	

