import Foundation

@objc public class testplugin: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
