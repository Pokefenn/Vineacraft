package pokefenn.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockVineacraft extends BlockContainer {

    
    public BlockVineacraft(int id, Material material) {
        
        super(id, material);
    }
    
 protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
     
 }

 
 
}