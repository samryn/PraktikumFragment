package www.smktelkommlg.praktikumfragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAbsen = new MutableLiveData<>();
    private MutableLiveData<String> mKelas = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }

    public void setAbsen(String absen) {
        mAbsen.setValue(absen);
    }
    public LiveData<String> getAbsen() {
        return mAbsen;
    }

    public void setKelas(String kelas) {
        mKelas.setValue(kelas);
    }
    public LiveData<String> getKelas() {
        return mKelas;
    }
}
