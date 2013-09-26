package pokefenn.creativetab;

import pokefenn.block.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;


public class CreativeTabVineacraft extends CreativeTabs {
    
    
    public CreativeTabVineacraft(int par1, String par2Str) {
        
        super(par1, par2Str);
    }

    
    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        
        return ModBlocks.vineaFurnace.blockID;
    }
    
    
}
