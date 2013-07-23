package pokefenn.block;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;

public class BlockLiquidCocoaStill extends BlockStationary {
    
    
    protected BlockLiquidCocoaStill(int id) {
        
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(3);
        this.setUnlocalizedName(Strings.LIQUID_COCOA_STILL_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
        this.disableStats();

}

}