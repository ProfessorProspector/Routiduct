package prospector.routiduct.container;

import net.minecraft.entity.player.EntityPlayer;
import prospector.routiduct.block.TilePackager;
import reborncore.client.gui.slots.BaseSlot;

/**
 * Created by Prospector
 */
public class ContainerPackager extends ContainerRoutiductBase {
	TilePackager tile;
	EntityPlayer player;

	public ContainerPackager(TilePackager tile, EntityPlayer player) {
		super();
		this.tile = tile;
		this.player = player;

		addPlayersHotbar(player);
		addPlayersInventory(player);

		for (int i = 0; i < tile.protocol.stacks; i++) {
			this.addSlotToContainer(new BaseSlot(tile.inventory, i, 20 * i + 10, 10));
		}
	}
}
