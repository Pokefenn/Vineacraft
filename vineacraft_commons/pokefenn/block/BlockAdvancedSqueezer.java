package pokefenn.block;

import pokefenn.lib.Strings;
import pokefenn.vineacraft.Vineacraft;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAdvancedSqueezer extends BlockVineacraft {
    
    public BlockAdvancedSqueezer(int id) {
        
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.ADVANCED_SQUEEZER_NAME);
        this.setCreativeTab(Vineacraft.tabsVineac);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
    }

}
