package binar.andlima.latihanimt

import android.os.Parcel
import android.os.Parcelable

data class DataImt(val berat_badan : Double, val tinggi_badan : Double) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeDouble(berat_badan)
        parcel.writeDouble(tinggi_badan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataImt> {
        override fun createFromParcel(parcel: Parcel): DataImt {
            return DataImt(parcel)
        }

        override fun newArray(size: Int): Array<DataImt?> {
            return arrayOfNulls(size)
        }
    }
}
