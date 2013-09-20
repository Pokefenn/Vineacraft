package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBasicMachineBlock extends Block {

	public BlockBasicMachineBlock(int id) {
		super(id, Material.wood);
		this.setUnlocalizedName(Strings.BASIC_MACHINE_BLOCK_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
		this.setHardness(3F);
	}

	
	
	@SideOnly(Side.CLIENT)
	private Icon topAndBotIcon;
	@SideOnly(Side.CLIENT)
	private Icon sidesIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		topAndBotIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.BASIC_MACHINE_BLOCK_TOP_AND_BOT);
		sidesIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.BASIC_MACHINE_BLOCK_SIDE);
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if(side == 0 || side == 1){
			return topAndBotIcon;		
		}else {
			return sidesIcon;
		}
		
		
	}
	
	
}
