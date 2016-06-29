package jordan.bettercraft.init;

import jordan.bettercraft.init.blocks.CustomBlock;
import jordan.bettercraft.init.blocks.Rock;
import jordan.bettercraft.init.blocks.ores.CopperOre;
import jordan.bettercraft.init.blocks.ores.RubyOre;
import jordan.bettercraft.init.blocks.ores.SapphireOre;
import jordan.bettercraft.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHugeMushroom.EnumType;
import net.minecraft.block.BlockPlanks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BetterBlocks 
{
	
	public static Block RUBY_ORE;
	public static Block SAPPHIRE_ORE;
	public static Block COPPER_ORE;
	
	public static Block CUSTOM_BLOCK;
	
	
	public static void init()
	{
		RUBY_ORE = new RubyOre();
		RUBY_ORE.setUnlocalizedName("ruby_ore");
		
		SAPPHIRE_ORE = new SapphireOre();
		SAPPHIRE_ORE.setUnlocalizedName("sapphire_ore");
		
		COPPER_ORE = new CopperOre();
		COPPER_ORE.setUnlocalizedName("copper_ore");
		
		CUSTOM_BLOCK = new CustomBlock();
		CUSTOM_BLOCK.setUnlocalizedName("custom_block");
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		registerRender(RUBY_ORE);
		registerRender(SAPPHIRE_ORE);
		registerRender(COPPER_ORE);
		registerRender(CUSTOM_BLOCK);
		
	}
	
	public static void registerRender(Block block)
	{
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}