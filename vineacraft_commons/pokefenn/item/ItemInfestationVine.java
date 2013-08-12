package pokefenn.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pokefenn.block.ModBlocks;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInfestationVine extends ItemVineacraft {

	public ItemInfestationVine(int id) {
		super(id);
        this.setUnlocalizedName(Strings.INFESTATION_VINE_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        setMaxStackSize(1);
        this.setMaxDamage(10);
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
		
		 
		
		
		return true;
	
	}
	


	
	
	

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister register) {
	
	itemIcon = register.registerIcon(ModItems.TEXTURE_LOCATION + ":" + ModItems.INFESTATION_VINE_ICON);       
	
	
}


}