// Generated by delombok at Fri Apr 05 13:27:37 CEST 2019
/*
 * Copyright (C) 2018 European Spallation Source ERIC.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.phoebus.applications.saveandrestore.model;

import org.epics.vtype.VType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import org.phoebus.applications.saveandrestore.model.json.VTypeDeserializer;
import org.phoebus.applications.saveandrestore.model.json.VTypeSerializer;

/**
 * Class encapsulating a {@link VType} holding the PV data. 
 * @author georgweiss
 * Created 28 Nov 2018
 */
@ApiModel(description = "Created by the service when a snapshot is requested.")
public class SnapshotItem {
	private int snapshotId;
	/**
	 * The {@link ConfigPv} associated with this {@link SnapshotItem}. The PV name
	 * and provider identity are determined from this.
	 */
	private ConfigPv configPv;
	/**
	 * The actual PV data, including alarms and time stamps.
	 */
	@JsonSerialize(using = VTypeSerializer.class)
	@JsonDeserialize(using = VTypeDeserializer.class)
	private VType value;
	/**
	 * The actual read-back PV data, including alarms and time stamps.
	 */
	@JsonSerialize(using = VTypeSerializer.class)
	@JsonDeserialize(using = VTypeDeserializer.class)
	private VType readbackValue;

	@Override
	public String toString() {
		return new StringBuffer().append(", value=").append(value != null ? value.toString() : "READ FAILED").append(", config pv=").append(configPv.toString()).append(readbackValue != null ? (", readback pv=" + readbackValue.toString()) : (", readback pv=READ_FAILED")).toString();
	}


	@java.lang.SuppressWarnings("all")
	public static class SnapshotItemBuilder {
		@java.lang.SuppressWarnings("all")
		private int snapshotId;
		@java.lang.SuppressWarnings("all")
		private ConfigPv configPv;
		@java.lang.SuppressWarnings("all")
		private VType value;
		@java.lang.SuppressWarnings("all")
		private VType readbackValue;

		@java.lang.SuppressWarnings("all")
		SnapshotItemBuilder() {
		}

		@java.lang.SuppressWarnings("all")
		public SnapshotItemBuilder snapshotId(final int snapshotId) {
			this.snapshotId = snapshotId;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public SnapshotItemBuilder configPv(final ConfigPv configPv) {
			this.configPv = configPv;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public SnapshotItemBuilder value(final VType value) {
			this.value = value;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public SnapshotItemBuilder readbackValue(final VType readbackValue) {
			this.readbackValue = readbackValue;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public SnapshotItem build() {
			return new SnapshotItem(snapshotId, configPv, value, readbackValue);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "SnapshotItem.SnapshotItemBuilder(snapshotId=" + this.snapshotId + ", configPv=" + this.configPv + ", value=" + this.value + ", readbackValue=" + this.readbackValue + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	public static SnapshotItemBuilder builder() {
		return new SnapshotItemBuilder();
	}

	@java.lang.SuppressWarnings("all")
	public int getSnapshotId() {
		return this.snapshotId;
	}

	/**
	 * The {@link ConfigPv} associated with this {@link SnapshotItem}. The PV name
	 * and provider identity are determined from this.
	 */
	@java.lang.SuppressWarnings("all")
	public ConfigPv getConfigPv() {
		return this.configPv;
	}

	/**
	 * The actual PV data, including alarms and time stamps.
	 */
	@java.lang.SuppressWarnings("all")
	public VType getValue() {
		return this.value;
	}

	/**
	 * The actual read-back PV data, including alarms and time stamps.
	 */
	@java.lang.SuppressWarnings("all")
	public VType getReadbackValue() {
		return this.readbackValue;
	}

	@java.lang.SuppressWarnings("all")
	public void setSnapshotId(final int snapshotId) {
		this.snapshotId = snapshotId;
	}

	/**
	 * The {@link ConfigPv} associated with this {@link SnapshotItem}. The PV name
	 * and provider identity are determined from this.
	 */
	@java.lang.SuppressWarnings("all")
	public void setConfigPv(final ConfigPv configPv) {
		this.configPv = configPv;
	}

	/**
	 * The actual PV data, including alarms and time stamps.
	 */
	@java.lang.SuppressWarnings("all")
	public void setValue(final VType value) {
		this.value = value;
	}

	/**
	 * The actual read-back PV data, including alarms and time stamps.
	 */
	@java.lang.SuppressWarnings("all")
	public void setReadbackValue(final VType readbackValue) {
		this.readbackValue = readbackValue;
	}

	@java.lang.SuppressWarnings("all")
	public SnapshotItem() {
	}

	@java.lang.SuppressWarnings("all")
	public SnapshotItem(final int snapshotId, final ConfigPv configPv, final VType value, final VType readbackValue) {
		this.snapshotId = snapshotId;
		this.configPv = configPv;
		this.value = value;
		this.readbackValue = readbackValue;
	}
}
