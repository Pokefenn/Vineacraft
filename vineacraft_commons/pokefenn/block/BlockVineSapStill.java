package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;



import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;

@SuppressWarnings("unused")
public class BlockVineSapStill extends BlockStationary {

    
    protected BlockVineSapStill(int id) {
        
        super(id, Material.water);
        blockHardness = 100F;
        this.setLightOpacity(3);
        this.setUnlocalizedName(Strings.VINE_SAP_STILL_NAME);
        //this.setCreativeTab(Vineacraft.tabsvineac);
        this.disableStats();
        
    }
}
